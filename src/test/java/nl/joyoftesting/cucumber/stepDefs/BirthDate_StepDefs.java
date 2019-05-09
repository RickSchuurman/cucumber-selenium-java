package nl.joyoftesting.cucumber.stepDefs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import cucumber.api.java.en.Given;
import io.cucumber.datatable.DataTable;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BirthDate_StepDefs {


    /*
    [Annie M. G., Schmidt, 1911-03-20]
     */

    @Given("^Data table without header")
    public void i_login_with_following_credentials(DataTable dt) {
        List<String> list = dt.asList(String.class);
        System.out.println("List - " + list);
        System.out.println("Firstname - " + list.get(0));
        System.out.println("Lastname - " + list.get(1));
        System.out.println("BirthDate - " + list.get(2));

//        String[] str = {"hallo", "hallo2"};
//        System.out.println(str[0]);
//
//        List<String> liststr = new ArrayList<>();
//        liststr.add("Hello");
//        liststr.get(0);
//        liststr.toArray()
//
    }


    /*
    [
      { "firstName": "Annie M.G", "lastName": "Schmidt",  "birthDate": "1911-03-20" }
    ]
    */

    @Given("^Data table with header$")
    public void dataTableWithHeader(DataTable dt) {
        List<Map<String, String>> list = dt.asMaps(String.class, String.class);
        System.out.println(list.get(0).get("firstName"));
        System.out.println(list.get(0).get("lastname"));
    }


     /*
    [
      { "firstName": "Annie M.G", "lastName": "Schmidt",  "birthDate": "1911-03-20" },
      { "firstName": "Roald",     "lastName": "Dahl",     "birthDate": "1916-09-13" },
      { "firstName": "Astrid",    "lastName": "Lindgren", "birthDate": "1907-11-14" }
    ]
    */

    @Given("^Data table with header multiple rows$")
    public void dataTableWithHeaderMultipleRows(DataTable dt) {
        List<String> actual = Arrays.asList("Annie M.G", "Roald", "Astrid");

        List<Map<String, String>> list = dt.asMaps(String.class, String.class);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).get("firstName"));
            assertEquals(list.get(i).get("firstName"), actual.get(i));
        }

        for(Map<String,String> item : list ) {
            assertTrue(actual.contains(item.get("firstname")));
        }

    }
}
