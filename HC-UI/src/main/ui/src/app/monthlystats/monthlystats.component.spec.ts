import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MonthlystatsComponent } from './monthlystats.component';

describe('MonthlystatsComponent', () => {
  let component: MonthlystatsComponent;
  let fixture: ComponentFixture<MonthlystatsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MonthlystatsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MonthlystatsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
