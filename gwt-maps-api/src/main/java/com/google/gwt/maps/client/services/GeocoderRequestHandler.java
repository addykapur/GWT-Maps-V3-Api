package com.google.gwt.maps.client.services;

/*
 * #%L
 * GWT Maps API V3 - Core API
 * %%
 * Copyright (C) 2011 - 2012 GWT Maps API V3
 * %%
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
 * #L%
 */

import com.google.gwt.core.client.JsArray;

/**
 * google.maps.Geocoder <br>
 * <br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#Geocoder">Geocoder API Doc</a>
 */
public interface GeocoderRequestHandler {

  /**
   * returns a result after on geocode callback
   * 
   * @param results
   * @param status
   */
  void onCallback(JsArray<GeocoderResult> results, GeocoderStatus status);

}
