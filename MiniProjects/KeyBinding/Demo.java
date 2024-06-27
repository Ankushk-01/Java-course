package MiniProjects.KeyBinding;

public class Demo {
    public static void main(String[] args) {
        // String ids = "Ankush";
        String ids = "89527,789244,9885,75636,8545632,965526";
        // Boolean result = deleteHistoricalAlert(ids);
        Boolean result = deleteHistoricalAlert(ids);
        // Boolean result = deleteHistoricalAlert("   ");
        // Boolean result = deleteHistoricalAlert(null);
        System.out.println("Result : "+result);
    }
    
    public static final Boolean deleteHistoricalAlert (String alertIds){
		if (alertIds == null){
			System.out.println("alerts cannot be null");
            return false;
        }
		if (alertIds.isEmpty() || alertIds.trim().isEmpty()){
			System.out.println("alerts cannot be empty");
            return false;
        }
		String [] alertIdList = alertIds.split(","); 
		for(int i =0;i<alertIdList.length;i++){
			long alertId = 0;
			try {
				alertId = Long.parseLong(alertIdList[i]);
			} catch (Exception e) {
				System.out.println("Unable to parse alert_id");
				return false;
			}
			if (alertId == 0)
				System.out.println("alert_id cannot be zero");
			deleteHistoricalAlert2(alertId);
		}
		return true;
	};

public static void deleteHistoricalAlert2(long alert){
	System.out.println("alert id : "+alert);
}
}