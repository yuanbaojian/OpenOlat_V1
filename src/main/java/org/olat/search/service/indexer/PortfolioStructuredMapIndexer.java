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

package org.olat.search.service.indexer;

import org.olat.portfolio.model.structel.EPStructuredMap;
import org.olat.portfolio.model.structel.ElementType;

/**
 * 
 * Description:<br>
 * Index the map of a user
 * 
 * <P>
 * Initial Date:  15 nov. 2010 <br>
 * @author srosse, stephane.rosse@frentix.com, http://www.frentix.com
 */
public class PortfolioStructuredMapIndexer extends AbstractPortfolioMapIndexer {

	public static final String STRUCTURED_TYPE = "type.db." + EPStructuredMap.class.getSimpleName();
	public static final String STRUCTURED_ORES_TYPE = EPStructuredMap.class.getSimpleName(); 
	

	@Override
	protected String getDocumentType() {
		return STRUCTURED_TYPE;
	}

	@Override
	protected ElementType getElementType() {
		return ElementType.STRUCTURED_MAP;
	}

	@Override
	public String getSupportedTypeName() {
		return STRUCTURED_ORES_TYPE;
	}
}