import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MnthstatlistComponent } from './mnthstatlist.component';

describe('MnthstatlistComponent', () => {
  let component: MnthstatlistComponent;
  let fixture: ComponentFixture<MnthstatlistComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MnthstatlistComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MnthstatlistComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
