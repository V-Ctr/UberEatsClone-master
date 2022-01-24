/**
 * Licensed to Codename One LTD under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  Codename One licenses this file
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

package com.codename1.demos.grub.controllers;

import com.codename1.demos.grub.interfaces.DishAddOn;
import com.codename1.demos.grub.views.DishAddOnView;
import com.codename1.demos.grub.views.DishView;
import com.codename1.rad.controllers.Controller;
import com.codename1.rad.controllers.FormController;
import com.codename1.rad.models.Entity;
import com.codename1.rad.nodes.ActionNode;
import com.codename1.rad.nodes.Node;
import com.codename1.rad.nodes.ViewNode;
import com.codename1.rad.ui.UI;
import com.codename1.ui.Form;
import com.codename1.ui.layouts.BorderLayout;

public class DishController extends FormController {

    public static final ActionNode addOnSelected = UI.action();

    public DishController(Controller parent, Entity entity, Node node) {
        super(parent);
        Form dishForm =  new Form(new BorderLayout());
        dishForm.getToolbar().hideToolbar();

        ViewNode dishAddOnNode = new ViewNode(
                UI.actions(DishAddOnView.ADD_ON_CLICKED, addOnSelected)
        );

        DishView dishView = new DishView(entity, node, dishAddOnNode);
        dishForm.add(BorderLayout.CENTER, dishView);
        setView(dishForm);

        addActionListener(addOnSelected, evt->{
            evt.consume();
            evt.getEntity().set(DishAddOn.isSelected, !evt.getEntity().getBoolean(DishAddOn.isSelected));
            ((DishAddOnView)evt.getSource()).update();
            dishView.update();
        });
    }

}