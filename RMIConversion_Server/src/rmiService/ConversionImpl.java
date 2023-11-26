package rmiService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ConversionImpl extends UnicastRemoteObject implements IConversion 
{
    @Override
    public double convertirMontant(double mt) 
    {
        return mt*3.3;
    }
    public ConversionImpl() throws RemoteException 
    {
    }
}