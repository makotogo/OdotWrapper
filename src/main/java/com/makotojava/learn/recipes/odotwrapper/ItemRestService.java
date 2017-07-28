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

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.makotojava.learn.odot.model.Item;

@RestController
@RequestMapping("/ItemRestService")
public class ItemRestService extends OdotRestController {

  @RequestMapping("/FindAll")
  public List<Item> findAllItems() {
    return getItemService().findAll();
  }

  @RequestMapping("/Ping")
  public PingGreeting ping() {
    return new PingGreeting().withGreeting("Hello from the server side!");
  }

// @RequestMapping("/FindById/{id}")
// public Item findByName(@PathVariable Long id) {
// return getItemService().findById(id);
// }
//
// @RequestMapping("/FindByDescription/{description}")
// public Item findByDescription(@PathVariable String description) {
// return getItemService().findByDescription(description);
// }
//
// @RequestMapping(value = "/Add", method = RequestMethod.PUT)
// public Item add(@RequestBody Item item) {
// Item ret;
// try {
// ret = getItemService().add(item);
// } catch (ServiceException e) {
// throw new RuntimeException("Could not add Item: " + ReflectionToStringBuilder.toString(item), e);
// }
// return ret;
// }
//
// @RequestMapping(value = "/Update", method = RequestMethod.POST)
// public String update(@RequestBody Item item) {
// String ret = "UPDATE FAILED";
// try {
// boolean updated = getItemService().update(item);
// if (updated) {
// ret = "UPDATE SUCCESSFUL";
// }
// } catch (ServiceException e) {
// throw new RuntimeException("Could not update Item: " + ReflectionToStringBuilder.toString(item), e);
// }
// return ret;
// }
//
// @RequestMapping(value = "/Delete", method = RequestMethod.DELETE)
// public String delete(@RequestBody Item item) {
// String ret = "DELETE FAILED";
// try {
// getItemService().delete(item);
// ret = "DELETE SUCCESSFUL";
// } catch (ServiceException e) {
// throw new RuntimeException("Could not delete Item: " + ReflectionToStringBuilder.toString(item), e);
// }
// return ret;
// }

}
