/**
* OLAT - Online Learning and Training<br>
* http://www.olat.org
* <p>
* Licensed under the Apache License, Version 2.0 (the "License"); <br>
* you may not use this file except in compliance with the License.<br>
* You may obtain a copy of the License at
* <p>
* http://www.apache.org/licenses/LICENSE-2.0
* <p>
* Unless required by applicable law or agreed to in writing,<br>
* software distributed under the License is distributed on an "AS IS" BASIS, <br>
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. <br>
* See the License for the specific language governing permissions and <br>
* limitations under the License.
* <p>
* Copyright (c) since 2004 at Multimedia- & E-Learning Services (MELS),<br>
* University of Zurich, Switzerland.
* <hr>
* <a href="http://www.openolat.org">
* OpenOLAT - Online Learning and Training</a><br>
* This file has been modified by the OpenOLAT community. Changes are licensed
* under the Apache 2.0 license as the original file.  
* <p>
*/ 

package org.olat.core.gui.control.generic.tabbable;

import org.olat.core.gui.components.tabbedpane.TabbedPane;
import org.olat.core.gui.control.Controller;

/**
 * Initial Date: Apr 28, 2004
 * 
 * @author gnaegi<br>
 *         Comment: A TabbableController has the ability to add some of its
 *         components to another controller as tabbs in a tabbed pane. This is
 *         usefull when the parent controller has a tabbed pane component and
 *         wants to add more than one tab from the child controller to its
 *         tabbed pane. See the EditorMainController and the various
 *         NodeEditControllers for an example
 */
public interface TabbableController extends Controller {
	/**
	 * Add tabs to the given tabbed pane
	 * 
	 * @param tabbedPane The tabbed pane
	 */
	public void addTabs(TabbedPane tabbedPane);
}