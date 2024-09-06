/*

    Licensed to the Apache Software Foundation (ASF) under one
    or more contributor license agreements.  See the NOTICE file
    distributed with this work for additional information
    regarding copyright ownership.  The ASF licenses this file
    to you under the Apache License, Version 2.0 (the
    "License"); you may not use this file except in compliance
    with the License.  You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing,
    software distributed under the License is distributed on an
    "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
    KIND, either express or implied.  See the License for the
    specific language governing permissions and limitations
    under the License.
 */
package org.apache.wiki.ajax;

import org.apache.wiki.plugin.SampleAjaxPlugin;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * An interface for a servlet that wants to use Ajax functionality.
 * See {@link SampleAjaxPlugin}
 *
 * @since 2.10.2-svn12
 */
public interface WikiAjaxServlet {

	String getServletMapping();

	void service( HttpServletRequest request, HttpServletResponse response, String actionName, List< String > params ) throws ServletException, IOException;

}
