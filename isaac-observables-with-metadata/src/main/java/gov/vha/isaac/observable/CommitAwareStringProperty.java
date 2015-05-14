/*
 * Copyright 2015 U.S. Department of Veterans Affairs.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package gov.vha.isaac.observable;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author kec
 */
public class CommitAwareStringProperty extends SimpleStringProperty {

    public CommitAwareStringProperty() {
    }

    public CommitAwareStringProperty(String initialValue) {
        super(initialValue);
    }

    public CommitAwareStringProperty(Object bean, String name) {
        super(bean, name);
    }

    public CommitAwareStringProperty(Object bean, String name, String initialValue) {
        super(bean, name, initialValue);
    }
   @Override
    public void set(String newValue) {
        CommitAwareIntegerProperty.checkChangesAllowed(getBean());
        super.set(newValue); 
    }

    @Override
    public void setValue(String v) {
        CommitAwareIntegerProperty.checkChangesAllowed(getBean());
        super.setValue(v); 
    }
    
}
