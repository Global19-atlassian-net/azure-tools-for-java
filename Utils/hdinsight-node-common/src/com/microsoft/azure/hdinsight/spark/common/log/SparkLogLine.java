/*
 * Copyright (c) Microsoft Corporation
 *
 * All rights reserved.
 *
 * MIT License
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 * documentation files (the "Software"), to deal in the Software without restriction, including without limitation
 * the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and
 * to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of
 * the Software.
 *
 * THE SOFTWARE IS PROVIDED *AS IS*, WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO
 * THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT,
 * TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.microsoft.azure.hdinsight.spark.common.log;

import com.microsoft.azure.hdinsight.common.MessageInfoType;

public class SparkLogLine {
    public static final String Tool = "azuretool";
    public static final String Livy = "livy";
    public static final String SparkDriverStdErr = "driver.stderr";

    private final String logSource;
    private final MessageInfoType messageInfoType;
    private final String rawLog;

    public SparkLogLine(final String logSource,
                        final MessageInfoType messageInfoType,
                        final String rawLog) {
        this.logSource = logSource;
        this.messageInfoType = messageInfoType;
        this.rawLog = rawLog;
    }

    public MessageInfoType getMessageInfoType() {
        return messageInfoType;
    }

    public String getLogSource() {
        return logSource;
    }

    public String getRawLog() {
        return rawLog;
    }
}
