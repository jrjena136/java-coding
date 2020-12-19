package temp;

public class Test {
    public static final String NAMESPACE_AIRSYNC  = "AirSync";
    public static final String NAMESPACE_POOMCONTACTS = "POOMCONTACTS";
    public static final String NAMESPACE_POOMMAIL = "POOMMAIL";
    public static final String NAMESPACE_AIRNOTIFY = "AirNotify";
    public static final String NAMESPACE_POOMCAL = "POOMCAL";
    public static final String NAMESPACE_MOVE = "Move";
    public static final String NAMESPACE_GETITEMESTIMATE = "GetItemEstimate";
    public static final String NAMESPACE_FOLDERHIERARCHY = "FolderHierarchy";
    public static final String NAMESPACE_MEETINGRESPONSE = "MeetingResponse";
    public static final String NAMESPACE_POOMTASKS = "POOMTASKS";
    public static final String NAMESPACE_RESOLVERECIPIENTS = "ResolveRecipients";
    public static final String NAMESPACE_VALIDATECERT = "ValidateCert";
    public static final String NAMESPACE_POOMCONTACTS2 = "POOMCONTACTS2";
    public static final String NAMESPACE_PING = "Ping";
    public static final String NAMESPACE_PROVISION = "Provision";
    public static final String NAMESPACE_SEARCH = "Search";
    public static final String NAMESPACE_GAL = "GAL";
    public static final String NAMESPACE_AIRSYNCBASE = "AirSyncBase";
    public static final String NAMESPACE_SETTINGS = "Settings";
    public static final String NAMESPACE_ITEMOPERATIONS = "ItemOperations";
    public static final String NAMESPACE_COMPOSEMAIL = "ComposeMail";
    public static final String NAMESPACE_EMAIL2 = "Email2";
    public static final String NAMESPACE_NOTES = "Notes";
    public static final String NAMESPACE_RIGHTSMANAGEMENT = "RightsManagement";
    public static final String[] NAMESPACES = {
            NAMESPACE_AIRSYNC,
            NAMESPACE_POOMCONTACTS,
            NAMESPACE_POOMMAIL,
            NAMESPACE_AIRNOTIFY,
            NAMESPACE_POOMCAL,
            NAMESPACE_MOVE,
            NAMESPACE_GETITEMESTIMATE,
            NAMESPACE_FOLDERHIERARCHY,
            NAMESPACE_MEETINGRESPONSE,
            NAMESPACE_POOMTASKS,
            NAMESPACE_RESOLVERECIPIENTS,
            NAMESPACE_VALIDATECERT,
            NAMESPACE_POOMCONTACTS2,
            NAMESPACE_PING,
            NAMESPACE_PROVISION,
            NAMESPACE_SEARCH,
            NAMESPACE_GAL,
            NAMESPACE_AIRSYNCBASE,
            NAMESPACE_SETTINGS,
            null,
            NAMESPACE_ITEMOPERATIONS,
            NAMESPACE_COMPOSEMAIL,
            NAMESPACE_EMAIL2,
            NAMESPACE_NOTES,
            NAMESPACE_RIGHTSMANAGEMENT
        };
    public static void main(String[] args) {/*
        Server s = new Server();
        WebAppContext ser = new WebAppContext();
        HouseKeeper hk = new HouseKeeper();
        DefaultSessionIdManager dsim = new DefaultSessionIdManager(s);
        hk.setSessionIdManager(dsim);
        ser.getSessionHandler().getSessionIdManager().setSessionHouseKeeper(hk);
    */
        String s = "test@test.com";
        String s1 = s.substring(0, s.indexOf("@"));
        System.out.println(s1);
        System.out.println(NAMESPACES.length);
        
        }

}
