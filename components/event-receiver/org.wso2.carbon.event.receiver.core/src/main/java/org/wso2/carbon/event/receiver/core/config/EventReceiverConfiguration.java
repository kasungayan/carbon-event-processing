/*
*  Copyright (c) 2005-2014, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
*  WSO2 Inc. licenses this file to you under the Apache License,
*  Version 2.0 (the "License"); you may not use this file except
*  in compliance with the License.
*  You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied.  See the License for the
* specific language governing permissions and limitations
* under the License.
*/
package org.wso2.carbon.event.receiver.core.config;

public class EventReceiverConfiguration {
    private String eventReceiverConfiguration;
    private String toStreamName;
    private String toStreamVersion = "1.0.0";
    private InputEventAdaptorConfiguration inputEventAdaptorConfiguration;
    private InputMapping inputMapping;
    private boolean traceEnabled;
    private boolean statisticsEnabled;
    private String filePath;
    private boolean isReadOnly;

    public boolean isTraceEnabled() {
        return traceEnabled;
    }

    public void setTraceEnabled(boolean traceEnabled) {
        this.traceEnabled = traceEnabled;
    }

    public boolean isStatisticsEnabled() {
        return statisticsEnabled;
    }

    public void setStatisticsEnabled(boolean statisticsEnabled) {
        this.statisticsEnabled = statisticsEnabled;
    }

    public InputEventAdaptorConfiguration getInputEventAdaptorConfiguration() {
        return inputEventAdaptorConfiguration;
    }

    public void setInputEventAdaptorConfiguration(InputEventAdaptorConfiguration inputEventAdaptorConfiguration) {
        this.inputEventAdaptorConfiguration = inputEventAdaptorConfiguration;
    }

    public InputMapping getInputMapping() {
        return inputMapping;
    }

    public void setInputMapping(InputMapping inputMapping) {
        this.inputMapping = inputMapping;
    }

    public String getToStreamName() {
        return toStreamName;
    }

    public void setToStreamName(String toStreamName) {
        this.toStreamName = toStreamName;
    }

    public String getToStreamVersion() {
        return toStreamVersion;
    }

    public void setToStreamVersion(String toStreamVersion) {
        this.toStreamVersion = toStreamVersion;
    }

    public String getEventReceiverName() {
        return eventReceiverConfiguration;
    }

    public void setEventReceiverName(String eventReceiverName) {
        this.eventReceiverConfiguration = eventReceiverName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public boolean isReadOnly() {
        return isReadOnly;
    }

    public void setReadOnly(boolean isReadOnly) {
        this.isReadOnly = isReadOnly;
    }
}