package telran.monitoring.api;

public interface RangeProviderClient {
    Range getRange(long patientId);
}