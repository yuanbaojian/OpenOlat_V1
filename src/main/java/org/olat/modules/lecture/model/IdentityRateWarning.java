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
package org.olat.modules.lecture.model;

import org.olat.modules.lecture.LectureRateWarning;

/**
 * 
 * Initial date: 14 févr. 2019<br>
 * @author srosse, stephane.rosse@frentix.com, http://www.frentix.com
 *
 */
public class IdentityRateWarning {
	
	private final Long identityKey;
	private LectureRateWarning warning;
	
	public IdentityRateWarning(Long identityKey, LectureRateWarning warning) {
		this.identityKey = identityKey;
		this.warning = warning;
	}
	
	public Long getIdentityKey() {
		return identityKey;
	}

	public LectureRateWarning getWarning() {
		return warning;
	}

	public void updateWarning(LectureRateWarning newState) {
		if(this.warning == null || this.warning.ordinal() < newState.ordinal()) {
			this.warning = newState;
		}
	}
}
