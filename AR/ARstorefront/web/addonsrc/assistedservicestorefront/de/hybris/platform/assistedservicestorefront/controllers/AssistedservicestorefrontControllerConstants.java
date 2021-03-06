/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 SAP SE or an SAP affiliate company.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 *
 *
 */
package de.hybris.platform.assistedservicestorefront.controllers;

public interface AssistedservicestorefrontControllerConstants
{
	String ADDON_PREFIX = "addon:/assistedservicestorefront/";

	// implement here controller constants used by this extension

	interface Views
	{

		interface Fragments
		{

			interface CustomerListComponent
			{
				String ASMCustomerListPopup = ADDON_PREFIX + "fragments/asmCustomerListComponent";
				String ASMCustomerListTable = ADDON_PREFIX + "fragments/asmCustomerListTable";
			}

		}
	}
}
