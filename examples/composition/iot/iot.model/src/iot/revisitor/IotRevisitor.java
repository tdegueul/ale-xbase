package iot.revisitor;

public interface IotRevisitor<Iot__ActuatorT extends Iot__HWCompT, Iot__BoardT, Iot__HWCompT, Iot__IotActivityT, Iot__IotOperationDefT, Iot__SensorT extends Iot__HWCompT, Iot__SketchT, Iot__SystemT> {
	Iot__ActuatorT iot__Actuator(final iot.Actuator it);
	Iot__BoardT iot__Board(final iot.Board it);
	Iot__SensorT iot__Sensor(final iot.Sensor it);
	Iot__SketchT iot__Sketch(final iot.Sketch it);
	Iot__SystemT iot__System(final iot.System it);

	default Iot__ActuatorT $(final iot.Actuator it) {
		return iot__Actuator(it);
	}
	default Iot__BoardT $(final iot.Board it) {
		return iot__Board(it);
	}
	default Iot__HWCompT $(final iot.HWComp it) {
		if (it.getClass() == iot.impl.ActuatorImpl.class)
			return iot__Actuator((iot.Actuator) it);
		if (it.getClass() == iot.impl.SensorImpl.class)
			return iot__Sensor((iot.Sensor) it);
		return null;
	}
	Iot__IotActivityT $(final iot.IotActivity it);
	Iot__IotOperationDefT $(final iot.IotOperationDef it);
	default Iot__SensorT $(final iot.Sensor it) {
		return iot__Sensor(it);
	}
	default Iot__SketchT $(final iot.Sketch it) {
		return iot__Sketch(it);
	}
	default Iot__SystemT $(final iot.System it) {
		return iot__System(it);
	}
}
