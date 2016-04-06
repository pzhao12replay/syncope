/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.syncope.client.console.panels;

import java.util.Arrays;
import java.util.List;
import org.apache.syncope.client.console.wicket.markup.html.form.AjaxPalettePanel;
import org.apache.syncope.common.lib.types.ConnectorCapability;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.model.util.ListModel;

public class ConnCapabilitiesPanel extends Panel {

    private static final long serialVersionUID = -2025535531121434050L;

    public ConnCapabilitiesPanel(final String id, final PropertyModel<List<ConnectorCapability>> model) {
        super(id, model);
        setOutputMarkupId(true);

        AjaxPalettePanel<ConnectorCapability> capabilitiesPalette =
                new AjaxPalettePanel.Builder<ConnectorCapability>().
                setAllowMoveAll(true).
                build("capabilitiesPalette",
                        model,
                        new ListModel<>(Arrays.asList(ConnectorCapability.values())));
        capabilitiesPalette.hideLabel();
        capabilitiesPalette.setOutputMarkupId(true);
        add(capabilitiesPalette);
    }
}