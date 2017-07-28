/*
 * Copyright 2017 Makoto Consulting Group, Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.makotojava.learn.recipes.odotwrapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.makotojava.learn.odot.service.ItemService;

/**
 * The RESTful Web Services wrapper.
 * 
 * @author J Steven Perry
 *
 */
@RestController
public class OdotRestController {

  @Autowired
  private ItemService itemService;

  public ItemService getItemService() {
    if (itemService == null) {
      throw new RuntimeException("ItemService not configured. Cannot continue.");
    }
    return itemService;
  }

}
