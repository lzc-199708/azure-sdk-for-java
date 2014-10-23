/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.websites.models;

import java.util.ArrayList;

/**
* Parameters supplied to the Update Web Site operation.
*/
public class WebSiteUpdateParameters {
    private ArrayList<String> hostNames;
    
    /**
    * Optional. An array of strings that contains the public host names for the
    * web site, including custom domains. Important: When you add a custom
    * domain in a PUT operation, be sure to include every host name that you
    * want for the web site. To delete a custom domain name in a PUT
    * operation, include all of the host names for the web site that you want
    * to keep, but leave out the one that you want to delete.
    * @return The HostNames value.
    */
    public ArrayList<String> getHostNames() {
        return this.hostNames;
    }
    
    /**
    * Optional. An array of strings that contains the public host names for the
    * web site, including custom domains. Important: When you add a custom
    * domain in a PUT operation, be sure to include every host name that you
    * want for the web site. To delete a custom domain name in a PUT
    * operation, include all of the host names for the web site that you want
    * to keep, but leave out the one that you want to delete.
    * @param hostNamesValue The HostNames value.
    */
    public void setHostNames(final ArrayList<String> hostNamesValue) {
        this.hostNames = hostNamesValue;
    }
    
    private ArrayList<WebSiteUpdateParameters.WebSiteHostNameSslState> hostNameSslStates;
    
    /**
    * Optional. SSL states of host names bound to the web site.
    * @return The HostNameSslStates value.
    */
    public ArrayList<WebSiteUpdateParameters.WebSiteHostNameSslState> getHostNameSslStates() {
        return this.hostNameSslStates;
    }
    
    /**
    * Optional. SSL states of host names bound to the web site.
    * @param hostNameSslStatesValue The HostNameSslStates value.
    */
    public void setHostNameSslStates(final ArrayList<WebSiteUpdateParameters.WebSiteHostNameSslState> hostNameSslStatesValue) {
        this.hostNameSslStates = hostNameSslStatesValue;
    }
    
    private String serverFarm;
    
    /**
    * Optional. String specifying the Server Farm (Web Hosting Plan) where to
    * place the site. Server Farm must exist.
    * @return The ServerFarm value.
    */
    public String getServerFarm() {
        return this.serverFarm;
    }
    
    /**
    * Optional. String specifying the Server Farm (Web Hosting Plan) where to
    * place the site. Server Farm must exist.
    * @param serverFarmValue The ServerFarm value.
    */
    public void setServerFarm(final String serverFarmValue) {
        this.serverFarm = serverFarmValue;
    }
    
    private String state;
    
    /**
    * Optional. A string that describes the state of the web site. Possible
    * values include Stopped, Running, or QuotaExceeded.
    * @return The State value.
    */
    public String getState() {
        return this.state;
    }
    
    /**
    * Optional. A string that describes the state of the web site. Possible
    * values include Stopped, Running, or QuotaExceeded.
    * @param stateValue The State value.
    */
    public void setState(final String stateValue) {
        this.state = stateValue;
    }
    
    /**
    * Initializes a new instance of the WebSiteUpdateParameters class.
    *
    */
    public WebSiteUpdateParameters() {
        this.setHostNames(new ArrayList<String>());
        this.setHostNameSslStates(new ArrayList<WebSiteUpdateParameters.WebSiteHostNameSslState>());
    }
    
    /**
    * SSL state of a site's hostname.
    */
    public static class WebSiteHostNameSslState {
        private String name;
        
        /**
        * Required. The host name.
        * @return The Name value.
        */
        public String getName() {
            return this.name;
        }
        
        /**
        * Required. The host name.
        * @param nameValue The Name value.
        */
        public void setName(final String nameValue) {
            this.name = nameValue;
        }
        
        private WebSiteSslState sslState;
        
        /**
        * Required. The SSL state. Possible values are Disabled, SniEnabled, or
        * IpBasedEnabled.
        * @return The SslState value.
        */
        public WebSiteSslState getSslState() {
            return this.sslState;
        }
        
        /**
        * Required. The SSL state. Possible values are Disabled, SniEnabled, or
        * IpBasedEnabled.
        * @param sslStateValue The SslState value.
        */
        public void setSslState(final WebSiteSslState sslStateValue) {
            this.sslState = sslStateValue;
        }
        
        private String thumbprint;
        
        /**
        * Optional. A string that contains the thumbprint of the SSL
        * certificate.
        * @return The Thumbprint value.
        */
        public String getThumbprint() {
            return this.thumbprint;
        }
        
        /**
        * Optional. A string that contains the thumbprint of the SSL
        * certificate.
        * @param thumbprintValue The Thumbprint value.
        */
        public void setThumbprint(final String thumbprintValue) {
            this.thumbprint = thumbprintValue;
        }
        
        private boolean toUpdate;
        
        /**
        * Required. Indicates whether the SSL state will be updated.
        * @return The ToUpdate value.
        */
        public boolean isToUpdate() {
            return this.toUpdate;
        }
        
        /**
        * Required. Indicates whether the SSL state will be updated.
        * @param toUpdateValue The ToUpdate value.
        */
        public void setToUpdate(final boolean toUpdateValue) {
            this.toUpdate = toUpdateValue;
        }
        
        /**
        * Initializes a new instance of the WebSiteHostNameSslState class.
        *
        */
        public WebSiteHostNameSslState() {
        }
        
        /**
        * Initializes a new instance of the WebSiteHostNameSslState class with
        * required arguments.
        *
        */
        public WebSiteHostNameSslState(String name, WebSiteSslState sslState, boolean toUpdate) {
            if (name == null) {
                throw new NullPointerException("name");
            }
            if (sslState == null) {
                throw new NullPointerException("sslState");
            }
            this.setName(name);
            this.setSslState(sslState);
            this.setToUpdate(toUpdate);
        }
    }
}
