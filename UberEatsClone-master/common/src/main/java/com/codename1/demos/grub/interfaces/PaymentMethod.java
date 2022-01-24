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


package com.codename1.demos.grub.interfaces;

import com.codename1.rad.models.Tag;

public interface PaymentMethod {
    Tag method = new Tag("method");
    Tag creditCard = new Tag("creditCard");

    public static final int CREDIT_CARD = 0;
    public static final int CASH = 1;
    public static final int APPLE_PAY = 2;
    public static final int PAYPAL = 3;
}
