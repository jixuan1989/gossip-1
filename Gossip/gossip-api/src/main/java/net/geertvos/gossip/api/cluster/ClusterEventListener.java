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

/**
 * @author Geert Vos
 */
public interface ClusterEventListener {

	public void onNewActiveMember(ClusterMember member);
	
	public void onNewInactiveMember(ClusterMember member);
	
	public void onMemberActivated(ClusterMember member);
	
	public void onMemberDeactivated(ClusterMember member);
	
	public void onClusterStabilized();
	
	public void onClusterDestabilized();
	
}
