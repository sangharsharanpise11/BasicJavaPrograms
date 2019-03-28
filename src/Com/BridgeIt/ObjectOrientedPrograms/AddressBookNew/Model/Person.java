package Com.BridgeIt.ObjectOrientedPrograms.AddressBookNew.Model;

	public class Person {
		private String name;
		private String phnumber;
		private String address;

		@Override
		public String toString() {
			return "Person[ Name" + name + "'Phnumber" + phnumber + ",Address" + address + "]";
		}

		public String getPhnumber() {
			return phnumber;
		}

		public void setPhnumber(String phnumber) {
			this.phnumber = phnumber;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

	}

