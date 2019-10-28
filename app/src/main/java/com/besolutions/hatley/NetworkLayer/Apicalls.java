package com.besolutions.standard.NetworkLayer;

import android.content.Context;

import com.android.volley.Request;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @desc Java Api Calls Contains all the Project Calls
 */

public class Apicalls
{

    private APIRouter apiRouter;

    public Apicalls(Context context, NetworkInterface networkInterface)
    {

        apiRouter = new APIRouter(context, networkInterface);
    }

    //----------------------------------------------------------------------------------------------

    /**
     *
     * @func User Login
     */

    public void loginUser(final String mail, final String password)
    {

        apiRouter.performRequest(Apiclient.LOGIN_USER.getURL(),Apiclient.LOGIN_USER.getParams(),Arrays.asList(mail,password), Request.Method.POST,Apiclient.LOGIN_USER.getCode());

    }



    //----------------------------------------------------------------------------------------------

    /**
     *
     * @func Investor Login
     */

    public void loginInvestor(final String email, final String pass)
    {

        apiRouter.performRequest(Apiclient.LOGIN_INVESTOR.getURL(),Apiclient.LOGIN_INVESTOR.getParams(),Arrays.asList(email,pass), Request.Method.POST,Apiclient.LOGIN_INVESTOR.getCode());

    }


    //----------------------------------------------------------------------------------------------

    /**
     *
     * @func User Registration
     */

    public void insertUser(final String Name, final String Email, final String Password, final String Age, final String Gender, final String Work, final String Mobile, final String Images, final String Identification, final String Account_statement)
    {

        apiRouter.performRequest(Apiclient.INSERT_USER.getURL(),Apiclient.INSERT_USER.getParams(),Arrays.asList(Name,Email,Password,Age,Gender,Work,Mobile,Images,Identification,Account_statement), Request.Method.POST,Apiclient.INSERT_USER.getCode());

    }


    //----------------------------------------------------------------------------------------------

    /**
     *
     * @func Investor Registration
     */

    public void insertInvestor(final String Name, final String Email, final String Password, final String Age, final String Gender, final String Work, final String Mobile, final String Images)
    {

        apiRouter.performRequest(Apiclient.INSERT_INVESTOR.getURL(),Apiclient.INSERT_INVESTOR.getParams(),Arrays.asList(Name,Email,Password,Age,Gender,Work,Mobile,Images), Request.Method.POST,Apiclient.INSERT_INVESTOR.getCode());

    }


    //----------------------------------------------------------------------------------------------

    /**
     *
     * @func Buy a Product
     */

    public void requestProduct(final String id_user, final String id_product, final String id_investor, final String date, final String status, final String cost, final String day, final String mouth, final String year, final String numberitems)
    {

        apiRouter.performRequest(Apiclient.REQUEST_PRODUCT.getURL(),Apiclient.REQUEST_PRODUCT.getParams(),Arrays.asList(id_user,id_product,id_investor,date,status,cost,day,mouth,year,numberitems), Request.Method.POST,Apiclient.REQUEST_PRODUCT.getCode());

    }


    //----------------------------------------------------------------------------------------------


    /**
     *
     * @func Retrieve Investors
     */

    public void selectInvestors(final String id_member)
    {

        apiRouter.performRequest(Apiclient.SELECT_INVESTORS.getURL(),Apiclient.SELECT_INVESTORS.getParams(),Collections.singletonList(id_member), Request.Method.POST,Apiclient.SELECT_INVESTORS.getCode());

    }


    //----------------------------------------------------------------------------------------------

    /**
     *
     * @func Retrieve Products
     */

    public void selectProducts(final String id_member)
    {

        apiRouter.performRequest(Apiclient.SELECT_PRODUCTS.getURL(),Apiclient.SELECT_PRODUCTS.getParams(),Collections.singletonList(id_member), Request.Method.POST,Apiclient.SELECT_PRODUCTS.getCode());

    }


    //----------------------------------------------------------------------------------------------

    /**
     *
     * @func Retrieve ADV1
     */

    public void selectAdv1()
    {

        apiRouter.performRequest(Apiclient.SELECT_ADV_1.getURL(),Apiclient.SELECT_ADV_1.getParams(),null, Request.Method.POST,Apiclient.SELECT_ADV_4.getCode());

    }


    //----------------------------------------------------------------------------------------------

    /**
     *
     * @func Retrieve ADV2
     */

    public void selectAdv2()
    {

        apiRouter.performRequest(Apiclient.SELECT_ADV_2.getURL(),Apiclient.SELECT_ADV_2.getParams(),null, Request.Method.POST,Apiclient.SELECT_ADV_4.getCode());

    }


    //----------------------------------------------------------------------------------------------

    /**
     *
     * @func Retrieve ADV3
     */

    public void selectAdv3()
    {

        apiRouter.performRequest(Apiclient.SELECT_ADV_3.getURL(),Apiclient.SELECT_ADV_3.getParams(),null, Request.Method.POST,Apiclient.SELECT_ADV_4.getCode());

    }


    //----------------------------------------------------------------------------------------------

    /**
     *
     * @func Retrieve ADV4
     */

    public void selectAdv4()
    {

        apiRouter.performRequest(Apiclient.SELECT_ADV_4.getURL(),Apiclient.SELECT_ADV_4.getParams(),null, Request.Method.POST,Apiclient.SELECT_ADV_4.getCode());

    }


    //----------------------------------------------------------------------------------------------


    /**
     *
     * @func Retrieve User Requests
     */

    public void selectMyRequests(final String id_user)
    {

        apiRouter.performRequest(Apiclient.SELECT_MY_REQUESTS.getURL(),Apiclient.SELECT_MY_REQUESTS.getParams(), Collections.singletonList(id_user), Request.Method.POST,Apiclient.SELECT_MY_REQUESTS.getCode());

    }


    //----------------------------------------------------------------------------------------------


    /**
     *
     * @func Update User Data
     */

    public void insertUser(final String id,final String Name, final String Email, final String Password, final String Age, final String Gender, final String Work, final String Mobile, final String Images, final String Identification, final String Account_statement)
    {

        apiRouter.performRequest(Apiclient.INSERT_USER.getURL(),Apiclient.INSERT_USER.getParams(),Arrays.asList(id,Name,Email,Password,Age,Gender,Work,Mobile,Images,Identification,Account_statement), Request.Method.POST,Apiclient.INSERT_USER.getCode());

    }


    //----------------------------------------------------------------------------------------------

    /**
     *
     * @func Update Investor Data
     */

    public void insertInvestor (final String id,final String Name, final String Email, final String Password, final String Age, final String Gender, final String Work, final String Mobile, final String Images)
    {

        apiRouter.performRequest(Apiclient.INSERT_INVESTOR.getURL(),Apiclient.INSERT_INVESTOR.getParams(),Arrays.asList(id,Name,Email,Password,Age,Gender,Work,Mobile,Images), Request.Method.POST,Apiclient.INSERT_INVESTOR.getCode());

    }


    //----------------------------------------------------------------------------------------------

    /**
     *
     * @func Update Investor Data
     */

    public void insertProduct(final String Title,final String Images, final String Price, final String Price_Agaal, final String Details, final String id_member, final String number)
    {

        apiRouter.performRequest(Apiclient.INSERT_PRODUCT.getURL(),Apiclient.INSERT_PRODUCT.getParams(),Arrays.asList(Title,Images,Price,Price_Agaal,Details,id_member,number), Request.Method.POST,Apiclient.INSERT_PRODUCT.getCode());

    }


    //----------------------------------------------------------------------------------------------

    /**
     *
     * @func Retrieve User Requests
     */

    public void selectMyRequestsInvestor(final String id_investor)
    {

        apiRouter.performRequest(Apiclient.SELECT_MY_REQUESTS_INVESTOR.getURL(),Apiclient.SELECT_MY_REQUESTS_INVESTOR.getParams(), Collections.singletonList(id_investor), Request.Method.POST,Apiclient.SELECT_MY_REQUESTS_INVESTOR.getCode());

    }


    //----------------------------------------------------------------------------------------------

    /**
     *
     * @func Retrieve Products
     */

    public void selectUser(final String id_user)
    {

        apiRouter.performRequest(Apiclient.SELECT_USER.getURL(),Apiclient.SELECT_USER.getParams(),Collections.singletonList(id_user), Request.Method.POST,Apiclient.SELECT_USER.getCode());

    }


    //----------------------------------------------------------------------------------------------

    /**
     *
     * @func Retrieve Products
     */

    public void selectInstallments(final String id_user)
    {

        apiRouter.performRequest(Apiclient.SELECT_MY_INSTALLMENTS.getURL(),Apiclient.SELECT_MY_INSTALLMENTS.getParams(),Collections.singletonList(id_user), Request.Method.POST,Apiclient.SELECT_MY_INSTALLMENTS.getCode());

    }


    //----------------------------------------------------------------------------------------------


    /**
     *
     * @func Update Investor Data
     */

    public void updateInstallment(final String id,final String status)
    {

        apiRouter.performRequest(Apiclient.UPDATE_INSTALLMENT.getURL(),Apiclient.UPDATE_INSTALLMENT.getParams(),Arrays.asList(id,status), Request.Method.POST,Apiclient.UPDATE_INSTALLMENT.getCode());

    }


    //----------------------------------------------------------------------------------------------

    /**
     *
     * @func Update Investor Data
     */

    public void updateRate(final String number_rate,final String number_star,final String id_user)
    {

        apiRouter.performRequest(Apiclient.UPDATE_RATE.getURL(),Apiclient.UPDATE_RATE.getParams(),Arrays.asList(number_rate,number_star,id_user), Request.Method.POST,Apiclient.UPDATE_RATE.getCode());

    }

    //----------------------------------------------------------------------------------------------
    public void updateUser(final String id,final String Name, final String Email, final String Password, final String Age, final String Gender, final String Work, final String Mobile, final String Images, final String Identification, final String Account_statement)
    {
        apiRouter.performRequest(Apiclient.UPDATE_USER.getURL(),Apiclient.UPDATE_USER.getParams(),Arrays.asList(id,Name,Email,Password,Age,Gender,Work,Mobile,Images,Identification,Account_statement), Request.Method.POST,Apiclient.UPDATE_USER.getCode());

    }

    //----------------------------------------------------------------------------------------------
    public void updateInvestor (final String id,final String Name, final String Email, final String Password, final String Age, final String Gender, final String Work, final String Mobile, final String Images)
    {
        apiRouter.performRequest(Apiclient.UPDATE_INVESTOR.getURL(),Apiclient.UPDATE_INVESTOR.getParams(),Arrays.asList(id,Name,Email,Password,Age,Gender,Work,Mobile,Images), Request.Method.POST,Apiclient.UPDATE_INVESTOR.getCode());

    }

    //----------------------------------------------------------------------------------------------


}
