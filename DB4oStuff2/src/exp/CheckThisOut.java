package exp;

import java.util.Date;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Query;

import db4oStuff.DB4oConnect;

public class CheckThisOut {

	public CheckThisOut() {

		DB4oConnect db4oc = new DB4oConnect();

		for (int i = 0; i < 9; i++) {
		//	ExpClassWithFields ecwf = new ExpClassWithFields(3, 4, i * 2.0, 6);
			ExpClassWithFieldsTwo ecwf = new ExpClassWithFieldsTwo(4, "F", new Date());
			//JPanel jp = ecwf.getJcb();
			db4oc.insertIntoDatabase(ecwf);
		}
		db4oc.getDb().commit();
		ExpClassWithFieldsTwo ecwf = new ExpClassWithFieldsTwo();

		// String stinkg = new String();

		// db4oc.deleteFromDatabase(ecwf.getClass(),ecwf);
	//	db4oc.getDb().commit();

		db4oc.openJTableWithObject(ecwf);
	//	db4oc.openJTableWithClass(ExpClassWithFields.class);
	}

	public static void main(String[] args) {

		new CheckThisOut();
		// experiment();
	}

	private static void experiment() {

		String filename;
		ObjectContainer db = null;

		filename = "C:/Users/denman/db4oStuff/jonny.db4o";

		if (db == null) {
			db = Db4oEmbedded.openFile(filename);
		}

		Query q = db.query();

		ObjectSet x = q.execute();

		int i = 0;
		while (x.hasNext()) {

			System.out.println(x.next().toString());
		}
	}
}
