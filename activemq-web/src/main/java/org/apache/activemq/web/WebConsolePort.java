/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.activemq.web;

/**
 * Bean to initialize the port number we use for embedded Jetty server for the web consoles.
 */
public class WebConsolePort {

    public static final int DEFAULT_PORT = 8161;

    private int port = DEFAULT_PORT;

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public void start() {
        // you may set a JVM system property for the jetty.port
        String port = System.getProperty("jetty.port", "" + this.port);
        System.setProperty("jetty.port", port);
    }
}