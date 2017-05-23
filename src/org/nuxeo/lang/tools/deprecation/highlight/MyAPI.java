/*
 * (C) Copyright 2017 Nuxeo SA (http://nuxeo.com/) and contributors.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser General Public License
 * (LGPL) version 2.1 which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-2.1.html
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * Contributors:
 *     Stephane Lacoin at Nuxeo (aka matic)
 */
package org.nuxeo.lang.tools.deprecation.highlight;

import org.nuxeo.lang.tools.deprecation.DeprecatedFor;
import org.nuxeo.lang.tools.deprecation.DeprecatedFor.Reason;

public interface MyAPI {

	@Deprecated
	@DeprecatedFor(reason=Reason.CodeLegacy, since="7.10")
	void legacy();
	
	@Deprecated
	@DeprecatedFor(reason=Reason.CodeRemoval, since="7.10")
	void forRemoval();
	
	
	@Deprecated
	void wrongDeprecation();
}
