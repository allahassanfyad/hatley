package com.besolutions.standard.NetworkLayer;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum Apiclient
{

    /**
     * @API
     *
     * ---> 1) URL OF API METHOD
     *
     * ---> 2) ARRAY OF PARAMETERS KEYS
     *
     */

    LOGIN_USER("user/login/549834453/25598", Arrays.asList("mail", "password"),1),
    LOGIN_INVESTOR("login_investor?",Arrays.asList("email", "pass"),2),
    INSERT_USER("insert_user?",Arrays.asList("Name","Email","Password","Age","Gender","Work","Mobile","Images","Identification","Account_statement"),3),
    INSERT_INVESTOR("insert_investor?",Arrays.asList("Name","Email","Password","Age","Gender","Work","Mobile","Images"),4),
    INSERT_PRODUCT("insert_product?",Arrays.asList("Title","Images","Price","Price_Agaal","Details","id_member","number"),5),
    REQUEST_PRODUCT("request_product?",Arrays.asList("id_user","id_product","id_investor","date","status","cost","day","mouth","year","numberitems"),6),
    SELECT_INVESTORS("selecte_all_investors", Collections.singletonList("id_member"),7),
    SELECT_MY_REQUESTS("selecte_my_request?", Collections.singletonList("id_user"),8),
    SELECT_USER("select_all_data_user?", Collections.singletonList("id_user"),9),
    SELECT_MY_REQUESTS_INVESTOR("selecte_my_request_invistor?", Collections.singletonList("id_investor"),10),
    SELECT_PRODUCTS("selecte_product_bymember?", Collections.singletonList("id_member"),11),
    SELECT_MY_INSTALLMENTS("selecte_my_installment?", Collections.singletonList("id_user"),12),
    SELECT_ADV_1("select_adv_1", null,13),
    SELECT_ADV_2("select_adv_2", null,14),
    SELECT_ADV_3("select_adv_3", null,15),
    SELECT_ADV_4("select_adv_4", null,16),
    UPDATE_RATE("update_rate?",Arrays.asList("number_rate","number_star","id_user"),16),
    UPDATE_INSTALLMENT("update_installment?",Arrays.asList("id","status"),18),
    UPDATE_USER("update_user?",Arrays.asList("id","Name","Email","Password","Age","Gender","Work","Mobile","Images","Identification","Account_statement"),19),
    UPDATE_INVESTOR( "update_investor?",Arrays.asList("id","Name","Email","Password","Age","Gender","Work","Mobile","Images"),20);



    //--------------------------------------

    /**
     * @BASE_URL
     */

    String BASE_URL = "https://webdesign.be4em.info/rosto_api_ar/";

    private final String URL;
    private final List<String> params;
    private  final int code;


    Apiclient(String URL, List<String> params, int code)
    {

        this.URL = URL;
        this.params = params;
        this.code = code;
    }

    public String getURL()
    {
        return BASE_URL + URL;
    }

    public List<String> getParams()
    {
        return params;
    }

    public int getCode()
    {
        return code;
    }
}
