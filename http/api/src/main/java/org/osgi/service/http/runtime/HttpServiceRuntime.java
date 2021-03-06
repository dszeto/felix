/*
 * Copyright (c) OSGi Alliance (2012, 2014). All Rights Reserved.
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

package org.osgi.service.http.runtime;

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.service.http.runtime.dto.RequestInfoDTO;
import org.osgi.service.http.runtime.dto.RuntimeDTO;

/**
 * The {@code HttpServiceRuntime} service represents the runtime information of
 * a Http (Whiteboard) Implementation.
 *
 * <p>
 * It provides access to DTOs representing the current state of the service.
 * <p>
 * The {@code HttpServiceRuntime} service must at least be registered with the
 * {@link HttpServiceRuntimeConstants#HTTP_SERVICE_ENDPOINT_ATTRIBUTE}
 * attribute.
 *
 * @ThreadSafe
 * @author $Id$
 */
@ProviderType
public interface HttpServiceRuntime {

	/**
	 * Return the runtime DTO representing the current state.
	 * @return The runtime DTO
	 */
	public RuntimeDTO getRuntimeDTO();
	
	/**
	 * Return a request info DTO containing the services
	 * involved with processing a request for the given
	 * path.
	 * @param path The request path, relative to the root of the
	 *             Http (Whiteboard) Service.
	 * @return A request info DTO
	 */
	public RequestInfoDTO calculateRequestInfoDTO(String path);
}
