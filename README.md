# Hibernate_HQL_Select_Queries
Hibernate Query Language (HQL) is same as SQL (Structured Query Language) but it doesn't depends on the table of the database. Instead of table name, we use class name in HQL. So it is database independent query language.

#Query Interface

It is an object oriented representation of Hibernate Query. The object of Query can be obtained by calling the createQuery() method Session interface.

The query interface provides many methods. There is given commonly used methods:

    public int executeUpdate() is used to execute the update or delete query.
    public List list() returns the result of the ralation as a list.
    public Query setFirstResult(int rowno) specifies the row number from where record will be retrieved.
    public Query setMaxResult(int rowno) specifies the no. of records to be retrieved from the relation (table).
    public Query setParameter(int position, Object value) it sets the value to the JDBC style query parameter.
    public Query setParameter(String name, Object value) it sets the value to a named query parameter.

