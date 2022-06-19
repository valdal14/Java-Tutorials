package com.valdal14.Internationalization;

/**
 *  INTERNATIONALIZATION ---------------------------------------------------------------------------------------------
 *      -> Internationalization or I18N (18 letters between I and N) and it is the process of supporting different
 *         languages and format that are supported in a particular location.
 *      -> Not only the language itself, but we need to consider the date formats mm/dd/yyyy or dd/mm/yyyy
 *      -> Key Java Classes to get to Internationalization are:
 *          --> Locale
 *          --> NumberFormat
 *          --> DateFormat
 *      -> Framework such as JSF and Spring provides support for those classes and the ResourceBundles will be used
 *         to automatically adapt to a certain Locale.
 *      -> As dev we provide ResourceBundles per Locale (Combination of Country and Language) and Spring or JSF will
 *         handle it.
 *      -> ResourceBundles are text file with specific info for each Locale.
 *
 *      -> LOCALE ====================================================================================================
 *          -> As I mentioned above is the combination of Country and Language
 *              -> I.E: US_EN
 *          -> In java we use a class Locale inside the package java.util.Locale
 *              -> Some very useful methods are:
 *                  --> Locale.getDefault()        --> Default language of our machine
 *                  --> setDefault(Locale locale); --> We can create a Locale instance by using Country and Language
 *                  --> getCountries()             --> Returns the list of all countries
 *                  --> getLanguages()             --> Returns the list of all languages
 *              -> The Locale class also provides a set of static variables such as
 *                  --> Locale.UK                  --> Returns an instance of Locale for UK
 *
 *                  // Switch or create and instance of a new Locale
 *                  Locale.setDefault(Locale.ITALY);
 *                  Locale italy = Locale.getDefault();
 *
 *      ==============================================================================================================
 *
 *      -> NUMBER FORMAT =============================================================================================
 *          -> java.text.NumberFormat
 *              // Instance method creates the NumberFormat
 *              NumberFormat nf = NumberFormat.getInstance();
 *
 *          -> getInstance
 *          -> getCurrencyInstance
 *          -> getPercentageInstance
 *          -> getNumberInstance
 *
 *          -> Once we got an instance of the NumberFormat we can use
 *             the .format(Long) or .format(Double) to format based on a Locale.
 *      ==============================================================================================================
 *
 *      -> DATE FORMAT ===============================================================================================
 *          -> java.text.DateFormat
 *          -> We can format dates based on a Locale
 *          -> We can use several methods such as
 *              --> getInstance
 *              --> getDateInstance
 *              --> getDataInstance(int style)
 *          -> Once we got an instance of the DateFormat we can use the .format(Date d) and it will format the date
 *             according to the Locale and the Style.
 *          -> The int style will determine how the output will look like
 *          -> There are different styles supported:
 *              --> DateFormat.FULL   --> 0 Monday, 12 Dec, 2022
 *              --> DateFormat.LONG   --> 1 12, December, 2022
 *              --> DateFormat.MEDIUM --> 2 12, Dec, 2022
 *              --> DateFormat.SHORT  --> 3 12/122022
 *
 *              DateFormat d = DateFormat.getDateInstance(0);
 *
 *      ==============================================================================================================
 *
 *      -> java.text.SimpleDataFormat ================================================================================
 *          -> A child class of the DateFormat class and allows us to convert a Date into any format
 *              --> format(Date date)
 *              --> parse(String date) --> From String to java.util.Date
 *
 *      ==============================================================================================================
 *  ------------------------------------------------------------------------------------------------------------------
 */

public class Internationalization {
}
