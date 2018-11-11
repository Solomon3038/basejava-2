import com.urise.webapp.storage.AbstractStorageTest;
import com.urise.webapp.storage.ObjectStreamPathStorage;

public class ObjectStreamPathStorageTest extends AbstractStorageTest {

    public ObjectStreamPathStorageTest() {
        super(new ObjectStreamPathStorage(STORAGE_DIR.getAbsolutePath()));
    }
}