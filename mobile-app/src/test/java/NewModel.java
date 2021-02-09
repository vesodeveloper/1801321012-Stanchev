import com.vesodeveloper.services.DBService;

public class NewModel {

	private String placeTitle;
	private String placeDesc;
	private String msg;

	public void SetPlaceDescription(String placeDesc) {
		// TODO Auto-generated method stub
this.SetPlaceDescription(placeDesc);		
	}

	public void pushAddDBButton() {
		// TODO Auto-generated method stub
	msg=DBService.add(placeTitle, placeDesc)	;
	}

}
