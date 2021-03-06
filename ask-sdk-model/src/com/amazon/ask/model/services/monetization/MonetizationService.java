/*
* Copyright 2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
*
* Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file
* except in compliance with the License. A copy of the License is located at
*
* http://aws.amazon.com/apache2.0/
*
* or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for
* the specific language governing permissions and limitations under the License.
*/

package com.amazon.ask.model.services.monetization;

import com.amazon.ask.model.services.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;



public interface MonetizationService {
    com.amazon.ask.model.services.monetization.InSkillProductsResponse getInSkillProducts(String acceptLanguage, String purchasable, String entitled, String productType, String nextToken, BigDecimal maxResults) throws com.amazon.ask.model.services.ServiceException;
    com.amazon.ask.model.services.monetization.InSkillProduct getInSkillProduct(String acceptLanguage, String productId) throws com.amazon.ask.model.services.ServiceException;
}
