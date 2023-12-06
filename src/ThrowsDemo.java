public class ThrowsDemo {
    public void getDetails(String key) throws Exception {
        if (key == null) {
            throw newNullPointerException("null key in getDetails");
        }
        // do something with the key
    }

    private Exception newNullPointerException(String nullKeyInGetDetails) {
        return null;
    }
}
