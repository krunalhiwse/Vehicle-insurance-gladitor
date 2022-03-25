import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ShowvehicleComponent } from './showvehicle.component';

describe('ShowvehicleComponent', () => {
  let component: ShowvehicleComponent;
  let fixture: ComponentFixture<ShowvehicleComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ShowvehicleComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ShowvehicleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
