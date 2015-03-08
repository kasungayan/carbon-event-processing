/*
*  Copyright (c) 2014-2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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
package org.wso2.carbon.event.output.adaptor.rdbms.internal.util;

/**
 * Gracefully append time for reconnection
 */
public class DecayTimer {

    private final long waitTimeSequenceSeconds[] = new long[] { 0, 0, 1, 5, 15, 30, 60, 300, 900, 1800, 3600 };
    private int position = 0;

    public void reset() {
        position = 0;
    }

    public void incrementPosition() {
        if (position != (waitTimeSequenceSeconds.length - 1)) {
            position++;
        }
    }

    public long returnTimeToWait() {
        return waitTimeSequenceSeconds[position] * 1000; //milliseconds
    }

}