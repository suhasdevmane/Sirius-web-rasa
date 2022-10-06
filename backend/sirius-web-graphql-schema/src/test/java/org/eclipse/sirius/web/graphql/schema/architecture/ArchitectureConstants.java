/*******************************************************************************
 * Copyright (c) 2019, 2020 Obeo.
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.sirius.web.graphql.schema.architecture;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;

/**
 * Constants shared accross multiple tests.
 *
 * @author sbegaudeau
 */
public final class ArchitectureConstants {
    public static final String SIRIUS_WEB_GRAPHQL_SCHEMA_ROOT_PACKAGE = "org.eclipse.sirius.web.graphql.schema.."; //$NON-NLS-1$

    // @formatter:off
    public static final JavaClasses CLASSES = new ClassFileImporter()
            .withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_JARS)
            .withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
            .importPackages(SIRIUS_WEB_GRAPHQL_SCHEMA_ROOT_PACKAGE);
    // @formatter:on

    private ArchitectureConstants() {
        // Prevent instantiation
    }
}
