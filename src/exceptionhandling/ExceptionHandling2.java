package exceptionhandling;

public class ExceptionHandling2 {

}

       /* try {
            ResourceConnection con = resourceFactory.getConnection();
            Results r = con.query("GET INFO FROM CUSTOMER");
            info = r.getData();
            con.close();
        } catch (ResourceException re) {
            error.write(re.getMessage());
        }
    }
return info; */

    // Answer: The resource connection will not be closed on line 5.
