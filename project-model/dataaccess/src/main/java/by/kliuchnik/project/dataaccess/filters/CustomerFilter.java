package by.kliuchnik.project.dataaccess.filters;
import javax.persistence.metamodel.SingularAttribute;

import by.kliuchnik.project.datamodel.Role;



public class CustomerFilter {
		
	 	private String name;
	 	private String password;
	 	private Role role;
	 	private String address;
	 	private String bankR;
	 	
		private SingularAttribute sortProperty;
	    private boolean sortOrder;
	    private Integer offset;
	    private Integer limit;

	    private boolean isFetchCustomer;
	    private boolean isFetchOrder;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public Role getRole() {
			return role;
		}
		public void setRole(Role role) {
			this.role = role;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getBankR() {
			return bankR;
		}
		public void setBankR(String bankR) {
			this.bankR = bankR;
		}
		public SingularAttribute getSortProperty() {
			return sortProperty;
		}
		public void setSortProperty(SingularAttribute sortProperty) {
			this.sortProperty = sortProperty;
		}
		public boolean isSortOrder() {
			return sortOrder;
		}
		public void setSortOrder(boolean sortOrder) {
			this.sortOrder = sortOrder;
		}
		public Integer getOffset() {
			return offset;
		}
		public void setOffset(Integer offset) {
			this.offset = offset;
		}
		public Integer getLimit() {
			return limit;
		}
		public void setLimit(Integer limit) {
			this.limit = limit;
		}
		public boolean isFetchUser() {
			return isFetchCustomer;
		}
		public void setFetchCustomer(boolean isFetchCustomer) {
			this.isFetchCustomer = isFetchCustomer;
		}
		public boolean isFetchOrder() {
			return isFetchOrder;
		}
		public void setFetchOrder(boolean isFetchOrder) {
			this.isFetchOrder = isFetchOrder;
		}

	   
	    
	    
}

		


