/*
 * Copyright (C) 2018 Nafundi
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.opendatakit.briefcase.matchers;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.opendatakit.briefcase.operations.export.ExportConfiguration;

public class ExportConfigurationMatchers {

  public static Matcher<ExportConfiguration> isEmpty() {
    return new TypeSafeMatcher<ExportConfiguration>() {

      @Override
      public void describeTo(Description description) {
        description.appendText("is empty");
      }

      @Override
      protected void describeMismatchSafely(ExportConfiguration item, Description mismatchDescription) {
        mismatchDescription.appendText("is not empty");
      }

      @Override
      protected boolean matchesSafely(ExportConfiguration item) {
        return item != null && item.isEmpty();
      }
    };
  }

  public static Matcher<ExportConfiguration> isValid() {
    return new TypeSafeMatcher<ExportConfiguration>() {

      @Override
      public void describeTo(Description description) {
        description.appendText("is valid");
      }

      @Override
      protected void describeMismatchSafely(ExportConfiguration item, Description mismatchDescription) {
        mismatchDescription.appendText("is not valid");
      }

      @Override
      protected boolean matchesSafely(ExportConfiguration item) {
        return item != null && item.isValid();
      }
    };
  }
}
