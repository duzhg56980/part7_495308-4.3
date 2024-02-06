import org.apache.http.impl.conn.tsccm.ConnPoolByRoute;
public class FunctionUse429 {
public void funcUse() {
ConnPoolByRoute connpoolbyroute = new ConnPoolByRoute();
connpoolbyroute.deleteClosedConnections();
}
}