package adhd.sirikan.pimpicha.adhdform;

/**
 * Created by TheUser on 30/3/2560.
 */

public class MyConstant {

    //Explicit
    private String urlAddUser = "http://adhdpj.com/app/addUserPim.php";
    private String urlGetUser = "http://adhdpj.com/app/getUser.php";
    private String[] columnUser = new String[]{"id", "User", "Password", "Type"};
    private String urlAddChild = "http://adhdpj.com/app/addChildPim.php";
    private String urlGetChild = "http://adhdpj.com/app/getChild.php";
    private String[] columnChild = new String[]{"id", "id_Login", "Name", "Age", "Image"};

    //For FTP
    private String hostString = "ftp.adhdpj.com";
    private String userString = "adhd@adhdpj.com";
    private String passwordString = "Pimpluempj402";
    private int portAnInt = 21;

    public String[] getColumnChild() {
        return columnChild;
    }

    public String getUrlGetChild() {
        return urlGetChild;
    }

    public String getUrlAddChild() {
        return urlAddChild;
    }

    public String getHostString() {
        return hostString;
    }

    public String getUserString() {
        return userString;
    }

    public String getPasswordString() {
        return passwordString;
    }

    public int getPortAnInt() {
        return portAnInt;
    }

    public String[] getColumnUser() {
        return columnUser;
    }

    public String getUrlGetUser() {
        return urlGetUser;
    }

    public String getUrlAddUser() {
        return urlAddUser;
    }
}//main class
