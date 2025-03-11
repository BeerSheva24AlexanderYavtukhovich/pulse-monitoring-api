package telran.monitoring.api;

public record AbnormalPulseValue(long patientId, int value, Range range) {
}