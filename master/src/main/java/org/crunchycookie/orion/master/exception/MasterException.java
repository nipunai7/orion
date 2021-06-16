/*
 * Copyright 2021 crunchycookie
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.crunchycookie.orion.master.exception;

import org.crunchycookie.orion.master.constants.MasterConstants.ErrorCodes;

public class MasterException extends Exception {

  private ErrorCodes errorCode;

  public MasterException(ErrorCodes errorCode, String message, Throwable cause) {

    super(message, cause);
    this.errorCode = errorCode;
  }

  public MasterException(ErrorCodes errorCode, String message) {

    super(message);
    this.errorCode = errorCode;
  }

  public MasterException(String message) {
    super(message);
  }

  public MasterException(String message, Throwable cause) {
    super(message, cause);
  }

  public ErrorCodes getErrorCode() {
    return errorCode;
  }
}
