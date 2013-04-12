/**
    This file is part of the Java Gossip Cluster Framework.

    The Java Gossip Framework is free software: you can redistribute it and/or modify
    it under the terms of the Lesser GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    The Java Gossip Framework is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this framework.  If not, see <http://www.gnu.org/licenses/>.
 */
package net.geertvos.gossip.api.cluster;

import java.util.List;

/**
 * @author Geert Vos
 */
public interface Cluster {

	public List<ClusterMember> getActiveMembers();
	
	public List<ClusterMember> getPassiveMembers();
	
	public List<ClusterMember> getMembers();
	
	public ClusterState getState();
	
	public void setEventService(ClusterEventService service);
	
	public ClusterEventService getEventService();
	
}
