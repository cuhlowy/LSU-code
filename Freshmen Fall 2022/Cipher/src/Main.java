public class Main {
	
	private String Message;
    private char Key;
    /*
    Main – Constructor that takes a starting message an encrypts it with the key.
    @param – String s1, char key
    */
    public Main(String s1, char key) {
        super();
        Message = s1;
        Key = key;
    }
    /*
    GetMessage – gets the message in the cipher
    @return –returns the (Encrypted!) message stored in the cipher
    */
    public String GetMessage() {
        return Message;
    }
    /*
    setMessage – sets the message
    */
    public void setMessage(String message) {
        Message = message;
    }
    /*
    getKey – gets the key 
    @return – returns the key
    */
    public char getKey() {
        return Key;
    }
    /*
    setKey – set the key
    */
    public void setKey(char key) {
        Key = key;
    }

}