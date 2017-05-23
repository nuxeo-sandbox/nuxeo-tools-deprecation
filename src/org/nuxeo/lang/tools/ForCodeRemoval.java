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
package org.nuxeo.lang.tools;

/**
 * A @Deprecated program element annotated with @ForCodeRemoval is one that programmers
 * are requested for usage removal. The annotated element should
 * provide indication about the upgrade path to follow. Any usage of that element
 * will result in a compilation error ``since`` the revision specified.
 */
public @interface ForCodeRemoval {
	String since();
}
