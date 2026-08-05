package org.example.group30_lifeinsuranceagency_2430810_2432057_2432097_2331068;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class AppendableObjectOutputStream extends ObjectOutputStream {
    public AppendableObjectOutputStream(OutputStream out) throws IOException{
        super(out);
    }
    @Override
    protected void writeStreamHeader() throws IOException{
        //

    }
}
