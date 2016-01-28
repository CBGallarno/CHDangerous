
package com.aczchef.chdangerous;

import com.laytonsmith.PureUtilities.SimpleVersion;
import com.laytonsmith.PureUtilities.Version;
import com.laytonsmith.core.extensions.AbstractExtension;
import com.laytonsmith.core.extensions.MSExtension;

@MSExtension("CHDangerous")
public class LifeCycle extends AbstractExtension {

	public Version getVersion() {
		return new SimpleVersion(1, 0, 2);
	}

	@Override
	public void onStartup() {
		System.out.println("CHDangerous " + getVersion() + " loaded.");
	}

	@Override
	public void onShutdown() {
		System.out.println("CHDangerous " + getVersion() + " unloaded.");
	}

}
