package hu.bme.mit.platform.data;

import java.util.List;

public class OrientDatabase implements Database {

    @Override
    public Repository getRepository(String uriString) {
        return null;
    }

    @Override
    public List<String> getExtantPlugins() {
        return null;
    }
}