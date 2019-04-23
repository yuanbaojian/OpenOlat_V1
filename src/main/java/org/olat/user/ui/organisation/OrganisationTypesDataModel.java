/**
 * <a href="http://www.openolat.org">
 * OpenOLAT - Online Learning and Training</a><br>
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); <br>
 * you may not use this file except in compliance with the License.<br>
 * You may obtain a copy of the License at the
 * <a href="http://www.apache.org/licenses/LICENSE-2.0">Apache homepage</a>
 * <p>
 * Unless required by applicable law or agreed to in writing,<br>
 * software distributed under the License is distributed on an "AS IS" BASIS, <br>
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. <br>
 * See the License for the specific language governing permissions and <br>
 * limitations under the License.
 * <p>
 * Initial code contributed and copyrighted by<br>
 * frentix GmbH, http://www.frentix.com
 * <p>
 */
package org.olat.user.ui.organisation;

import java.util.List;

import org.olat.core.commons.persistence.SortKey;
import org.olat.core.gui.components.form.flexible.impl.elements.table.DefaultFlexiTableDataModel;
import org.olat.core.gui.components.form.flexible.impl.elements.table.FlexiSortableColumnDef;
import org.olat.core.gui.components.form.flexible.impl.elements.table.FlexiTableColumnModel;
import org.olat.core.gui.components.form.flexible.impl.elements.table.SortableFlexiTableDataModel;

/**
 * 
 * Initial date: 4 mai 2018<br>
 * @author srosse, stephane.rosse@frentix.com, http://www.frentix.com
 *
 */
public class OrganisationTypesDataModel extends DefaultFlexiTableDataModel<OrganisationTypeRow>
implements SortableFlexiTableDataModel<OrganisationTypeRow> {
	
	public OrganisationTypesDataModel(FlexiTableColumnModel columnModel) {
		super(columnModel);
	}

	@Override
	public void sort(SortKey orderBy) {
		if(orderBy != null) {
			List<OrganisationTypeRow> views = new OrganisationTypesDataModelSortDelegate(orderBy, this, null).sort();
			super.setObjects(views);
		}
	}
	
	@Override
	public Object getValueAt(int row, int col) {
		OrganisationTypeRow type = getObject(row);
		return getValueAt(type, col);
	}

	@Override
	public Object getValueAt(OrganisationTypeRow row, int col) {
		switch(TypeCols.values()[col]) {
			case key: return row.getKey();
			case identifier: return row.getIdentifier();
			case displayName: return row.getDisplayName();
			case externalId: return row.getExternalId();
			case tools: return row.getToolsLink();
			default: return null;
		}
	}

	@Override
	public OrganisationTypesDataModel createCopyWithEmptyList() {
		return new OrganisationTypesDataModel(getTableColumnModel());
	}
	
	public enum TypeCols implements FlexiSortableColumnDef {
		key("table.header.key"),
		identifier("table.type.header.type.identifier"),
		displayName("table.type.header.type.displayName"),
		externalId("table.type.header.type.externalId"),
		tools("table.header.tools");
		
		private final String i18nHeaderKey;
		
		private TypeCols(String i18nHeaderKey) {
			this.i18nHeaderKey = i18nHeaderKey;
		}

		@Override
		public boolean sortable() {
			return true;
		}

		@Override
		public String sortKey() {
			return name();
		}

		@Override
		public String i18nHeaderKey() {
			return i18nHeaderKey;
		}
	}
}
