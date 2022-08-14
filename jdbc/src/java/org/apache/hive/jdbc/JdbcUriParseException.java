/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. See accompanying LICENSE file.
 */

package org.apache.hive.jdbc;

import java.sql.SQLException;

public class JdbcUriParseException extends SQLException {

  private static final long serialVersionUID = 0;

  /**
   * @param cause (original exception)
   */
  public JdbcUriParseException(Throwable cause) {
    super(cause);
  }

  /**
   * @param msg (exception message)
   */
  public JdbcUriParseException(String msg) {
    super(msg);
  }

  /**
   * @param msg (exception message)
   * @param cause (original exception)
   */
  public JdbcUriParseException(String msg, Throwable cause) {
    super(msg, cause);
  }

}
