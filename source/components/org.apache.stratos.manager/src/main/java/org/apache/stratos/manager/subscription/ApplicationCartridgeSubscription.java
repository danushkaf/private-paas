/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.stratos.manager.subscription;

import org.apache.stratos.manager.repository.Repository;
import org.apache.stratos.manager.subscription.tenancy.SubscriptionTenancyBehaviour;
import org.apache.stratos.cloud.controller.stub.pojo.CartridgeInfo;

public class ApplicationCartridgeSubscription extends CartridgeSubscription {


    private static final long serialVersionUID = 3969055979835359336L;

    /**
     * Constructor
     *
     * @param cartridgeInfo CartridgeInfo instance
     * @param subscriptionTenancyBehaviour SubscriptionTenancyBehaviour instance
     */
    public ApplicationCartridgeSubscription(CartridgeInfo cartridgeInfo, SubscriptionTenancyBehaviour
            subscriptionTenancyBehaviour) {
        super(cartridgeInfo, subscriptionTenancyBehaviour);
    }


    public Repository manageRepository (String repoURL, String repoUserName, String repoUserPassword,
                                        boolean privateRepo) {

        //no repository for application cartridge instances
        return null;
    }
}
